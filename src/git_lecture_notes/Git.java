package git_lecture_notes;
/*
* what is GIT?
* git -- it is software......
* ------version control system(VCS).
*
*
*
*
* git configuration
*
* git config --global user.name "Shankar-Sala"
* git config --global user.email "shankarsala9995@gmail.com"
* */

public class Git {
}


/*
*
* Administrator@DESKTOP-E9K307P MINGW64 ~
$ pwd
/c/Users/Administrator

Administrator@DESKTOP-E9K307P MINGW64 ~
$ cd OneDrive/desktop

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop
$ mkdir git_application

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop
$ cd git_application/

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application
$ ls

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application
$ git init
Initialized empty Git repository in C:/Users/Administrator/OneDrive/Desktop/git_application/.git/

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ ls -a
./  ../  .git/

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ touch index.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ echo "Hello, Git Enviornment .....!"> index.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ cat index.html
Hello, Git Enviornment .....!

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ ls
index.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ touch index2.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ touch index3.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ rm index2.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ ls
index.html  index3.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ rm index3.html

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ touch index2.txt index3.txt

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ ls
index.html  index2.txt  index3.txt

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html
        index2.txt
        index3.txt

nothing added to commit but untracked files present (use "git add" to track)

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ git add .
warning: in the working copy of 'index.html', LF will be replaced by CRLF the next time Git touches it

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   index.html
        new file:   index2.txt
        new file:   index3.txt


Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ git commit -m "Save it"
[main (root-commit) 36eabde] Save it
 3 files changed, 1 insertion(+)
 create mode 100644 index.html
 create mode 100644 index2.txt
 create mode 100644 index3.txt

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$ git log
commit 36eabde2576fd4e7a82467b7e06e82a0af969190 (HEAD -> main)
Author: Shankar-Sala <shankarsala9995@gmail.com>
Date:   Wed Jun 3 15:33:13 2026 +0530

    Save it

Administrator@DESKTOP-E9K307P MINGW64 ~/OneDrive/desktop/git_application (main)
$*/