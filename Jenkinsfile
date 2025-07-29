@Library('add-ons-shared-libs@feat/init') _

node {
    continuousIntegrationPipeline(
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-command",
            tokenId: "sonarcloud-token-kura-command&",
            exclusions: "tests/**/*.java"
        ],
    )
}
