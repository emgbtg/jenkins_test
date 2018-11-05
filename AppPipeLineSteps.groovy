
def testFunc() {
    echo "running fastlane"
    sh "pwd"
    sh "cd jenkins_test_ios"
    sh "fastlane generate_ipa_develop"
}
return this
