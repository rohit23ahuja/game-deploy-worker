package learn.event.game.event;

public record DeploymentRequestedEvent(Long deploymentId,
                                       String casinoId,
                                       String gameId,
                                       String version,
                                       String status) {
}
