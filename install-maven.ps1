$ErrorActionPreference = 'Stop'

New-Item -ItemType Directory -Force -Path 'C:\tools' | Out-Null

$url = 'https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip'
$zip = 'C:\tools\apache-maven-3.9.9-bin.zip'

Invoke-WebRequest -Uri $url -OutFile $zip
Expand-Archive -Path $zip -DestinationPath 'C:\tools' -Force

& 'C:\tools\apache-maven-3.9.9\bin\mvn.cmd' -v
