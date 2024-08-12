{ 
  pkgs
  }: 
  {
  deps = [
    pkgs.adoptopenjdk-openj9-bin-11
    pkgs.openjdk16-bootstrap
    pkgs.bazel-remote
    pkgs.remotebox
    pkgs.gradle_4
    pkgs.gradle_5
    pkgs.gradle_6
    pkgs.gradle
    pkgs.openjdk17
  ];
}