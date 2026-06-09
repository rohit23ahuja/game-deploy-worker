package learn.event.game.event;

public record DeploymentCompletedEvent(Long deploymentId, String status) {
}
