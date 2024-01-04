def build() {
  echo 'Building the app'
}

def test() {
  echo 'Testing the app'
}

def run() {
  // We have the access to VERSION that exist in the file we imported
  echo "Running the app ${VERSION}"
}

return this
