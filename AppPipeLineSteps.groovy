
def testFunc() {
    echo "running fastlane"
    sh "pwd"
    sh " cd ~/Users/egilbert/Documents/Projects/jenkins_test/jenkins_test_ios"
    sh "fastlane generate_ipa_develop"
}
return this
