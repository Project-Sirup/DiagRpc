package sirup.service.diag.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.diag.rpc.proto.DiagnosticsRequest;
import sirup.service.diag.rpc.proto.DiagnosticsResponse;
import sirup.service.diag.rpc.proto.Report;
import sirup.service.diag.rpc.proto.SirupDiagnosticsServiceGrpc;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class DiagnosticsClient {

    private static String address;
    private static int port;
    private static DiagnosticsClient instance;
    private ManagedChannel managedChannel;
    private SirupDiagnosticsServiceGrpc.SirupDiagnosticsServiceBlockingStub diagService;
    private DiagnosticsClient() {
        managedChannel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        diagService = SirupDiagnosticsServiceGrpc.newBlockingStub(managedChannel);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public static void init(String address, int port) {
        DiagnosticsClient.address = address;
        DiagnosticsClient.port = port;
    }

    public static DiagnosticsClient getInstance() {
        return instance == null ? instance = new DiagnosticsClient() : instance;
    }

    public Optional<Report> runDiagnostics(String token, String userId) {
        DiagnosticsRequest request = DiagnosticsRequest.newBuilder()
                .setToken(token)
                .setUserId(userId)
                .build();
        try {
            DiagnosticsResponse response = diagService.runDiagnostics(request);
            return Optional.of(response.getReport());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
