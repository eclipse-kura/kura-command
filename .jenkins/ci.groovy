@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-command",
            tokenId: "sonarcloud-token-kura-command",
            exclusions: "tests/**/*.java"
        ],
    )
}
