#Compile instructions for Java
github instructions and example


classpractice 2 has scanner  and array and console input example



javac --source-path myapp -d bin myapp/*

java -cp bin myapp.HelloWorld

C:\Users\65932\vttp5_sdf_da01l>javac HelloWorld.java

C:\Users\65932\vttp5_sdf_da01l>java HelloWorld

>javac --source-path . -d  bin ./*.java

java -cp bin HelloWorld



jar -c -v -f hWorld.jar -e HelloWorld .
(The dot must have a space)

jar -c -v -f hWorld.jar -e HelloWorld .


java -jar hWorld.jar myapp.HelloWorld


C:\Users\65932>echo %JAVA_HOME%
C:\Program Files\Java\jdk-23

C:\Users\65932>md vttp5_sdf_da01l

C:\Users\65932>cd vttp5_sdf_da01l

C:\Users\65932\vttp5_sdf_da01l>git init
Initialized empty Git repository in C:/Users/65932/vttp5_sdf_da01l/.git/

C:\Users\65932\vttp5_sdf_da01l>echo.>README.md

C:\Users\65932\vttp5_sdf_da01l>git add *

C:\Users\65932\vttp5_sdf_da01l>git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   README.md


C:\Users\65932\vttp5_sdf_da01l>git commit -m "initial commit to add README.md"
[master (root-commit) c12e8c2] initial commit to add README.md
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

C:\Users\65932\vttp5_sdf_da01l>git branch
* master

C:\Users\65932\vttp5_sdf_da01l>git branch -m main

C:\Users\65932\vttp5_sdf_da01l>git branch
* main

C:\Users\65932\vttp5_sdf_da01l>git remote add origin https://github.com/jonahng/vttp5_sdf_day01l.git

C:\Users\65932\vttp5_sdf_da01l>git remote -v
origin  https://github.com/jonahng/vttp5_sdf_day01l.git (fetch)
origin  https://github.com/jonahng/vttp5_sdf_day01l.git (push)

C:\Users\65932\vttp5_sdf_da01l>git config list
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=jonahng
user.email=nyhj1998@gmail.com
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true
remote.origin.url=https://github.com/jonahng/vttp5_sdf_day01l.git
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*

C:\Users\65932\vttp5_sdf_da01l>git config user.name
jonahng

C:\Users\65932\vttp5_sdf_da01l>git config user.email
nyhj1998@gmail.com

C:\Users\65932\vttp5_sdf_da01l>git push -u origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 228 bytes | 228.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/jonahng/vttp5_sdf_day01l.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

C:\Users\65932\vttp5_sdf_da01l>javac HelloWorld.java

C:\Users\65932\vttp5_sdf_da01l>java HelloWorld
Hello Worlddd hihihi

C:\Users\65932\vttp5_sdf_da01l>javac --source-path myapp\-d myapp\myapp/HelloWorld.java
error: file not found: myapp\myapp\HelloWorld.java
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Users\65932\vttp5_sdf_da01l>javac myapp/HelloWorld.java

C:\Users\65932\vttp5_sdf_da01l>java HelloWorld
Error: Could not find or load main class HelloWorld
Caused by: java.lang.ClassNotFoundException: HelloWorld

C:\Users\65932\vttp5_sdf_da01l>java myapp/HelloWorld
Hello Worlddd hihihi

C:\Users\65932\vttp5_sdf_da01l>java myapp.HelloWorl
Error: Could not find or load main class myapp.HelloWorl
Caused by: java.lang.ClassNotFoundException: myapp.HelloWorl

C:\Users\65932\vttp5_sdf_da01l>java myapp.HelloWorld
Hello Worlddd hihihi

C:\Users\65932\vttp5_sdf_da01l>javac --source-path myapp -d bin myapp/*

C:\Users\65932\vttp5_sdf_da01l>java bin/HelloWorld
Error: Could not find or load main class bin.HelloWorld
Caused by: java.lang.ClassNotFoundException: bin.HelloWorld

C:\Users\65932\vttp5_sdf_da01l>java bin.HelloWorld
Error: Could not find or load main class bin.HelloWorld
Caused by: java.lang.ClassNotFoundException: bin.HelloWorld

C:\Users\65932\vttp5_sdf_da01l>java bin\myapp.HelloWorld
Error: Could not find or load main class bin\myapp.HelloWorld
Caused by: java.lang.NoClassDefFoundError: bin\myapp/HelloWorld (wrong name: myapp/HelloWorld)

C:\Users\65932\vttp5_sdf_da01l>java myapp.HelloWorld
Error: Could not find or load main class myapp.HelloWorld
Caused by: java.lang.ClassNotFoundException: myapp.HelloWorld

C:\Users\65932\vttp5_sdf_da01l>java HelloWorld
Error: Could not find or load main class HelloWorld
Caused by: java.lang.ClassNotFoundException: HelloWorld

C:\Users\65932\vttp5_sdf_da01l>java -cp bin myapp.HelloWorld
Hello Worlddd hihihi

C:\Users\65932\vttp5_sdf_da01l>javac --source-path . -d  bin ./*.java

C:\Users\65932\vttp5_sdf_da01l>java -cp bin HelloWorl
Error: Could not find or load main class HelloWorl
Caused by: java.lang.ClassNotFoundException: HelloWorl

C:\Users\65932\vttp5_sdf_da01l>java -cp bin HelloWorld
Hello Worlddd hihihi

C:\Users\65932\vttp5_sdf_da01l>cd bin

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e HelloWorld.
'c' flag requires manifest or input files to be specified!
Try `jar --help' for more information.

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e HelloWorld.
'c' flag requires manifest or input files to be specified!
Try `jar --help' for more information.

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e bin.HelloWorld.
'c' flag requires manifest or input files to be specified!
Try `jar --help' for more information.

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e bin.HelloWorld
'c' flag requires manifest or input files to be specified!
Try `jar --help' for more information.

C:\Users\65932\vttp5_sdf_da01l\bin>

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e HelloWorld .
added manifest
adding: HelloWorld.class(in = 434) (out= 294)(deflated 32%)
adding: myapp/(in = 0) (out= 0)(stored 0%)

C:\Users\65932\vttp5_sdf_da01l\bin>cd ..

C:\Users\65932\vttp5_sdf_da01l>cd bin

C:\Users\65932\vttp5_sdf_da01l\bin>java - jar hWorld.jar
Unrecognized option: -
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

C:\Users\65932\vttp5_sdf_da01l\bin>java - jar hWorld
Unrecognized option: -
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

C:\Users\65932\vttp5_sdf_da01l\bin>java - jar hWorld
Unrecognized option: -
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

C:\Users\65932\vttp5_sdf_da01l\bin>java - jar . hWorld
Unrecognized option: -
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e myApp.HelloWorld .
added manifest
adding: HelloWorld.class(in = 434) (out= 294)(deflated 32%)
adding: myapp/(in = 0) (out= 0)(stored 0%)

C:\Users\65932\vttp5_sdf_da01l\bin>jar -c -v -f hWorld.jar -e HelloWorld .
added manifest
adding: HelloWorld.class(in = 434) (out= 294)(deflated 32%)
adding: myapp/(in = 0) (out= 0)(stored 0%)

C:\Users\65932\vttp5_sdf_da01l\bin>java -jar hWorld.jar myapp.HelloWorld
Hello Worlddd hihihi




import java.io.*;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello Worlddd hihihi");

        Console console = System.console();
        String name = console.readLine("What is your name");
        System.out.println("your name is :" + name);
    }
}