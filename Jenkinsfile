isPullRequest = true

devBuildScheme = "Dev"
betaBuildScheme = "Beta"
releaseBuildScheme = "Release"


// Hockey App
ipaFilename = ""
hockeyAppToken = ""
hockeyAppId = ""

isPullRequest = env.BRANCH_NAME.startsWith("PR")

if (env.BRANCH_NAME == "dev") {
    buildScheme = devBuildScheme
    //sh 'echo **********dev branch**********'
}
else if (env.BRANCH_NAME == "master") {
    buildScheme = releaseBuildScheme
    //sh 'echo **********master branch**********'
}
else if (isPullRequest) {
    buildScheme = pullRequestBuildScheme
   // sh 'echo **********pr**********'
}

//echo "Running ${env.BRANCH_NAME} on ${env.JENKINS_URL}"

