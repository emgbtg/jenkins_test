
def testFunc() {
    echo "running fastlane"
    sh "pwd"
    sh "fastlane generate_ipa_develop"
}
return this
