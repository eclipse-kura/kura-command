@Library('add-ons-shared-libs@ci/fix_main_branch_builds') _

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
