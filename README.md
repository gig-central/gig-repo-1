
       MAIN PROJECT DOCUMENT URL AT:

TINY URL ADDRESS:  https://tinyurl.com/gig-central

FULL URL ADDRESS:  https://docs.google.com/document/d/1iylNjfON949K-K1fXOfzn09hAe5EoGhSEkFmECPvxMI




[![N|Solid](http://www.dylanwilkinson.me/images/gigCentral2.png)](https://nodesource.com/products/nsolid)

# How to set up your config files:

- Create a folder in application/config named development.
- Copy config.php, database.php and custom_config.php into development folder and update with your information.
- When pushing to your branch this development folder will be ignored.


# Workflow

1. Clone Repo locally.
2. When you want to start working on anything create a descriptively named branch off of the stable master branch. 
3. Push to named branches constantly. 
>Pushing to your named branch doesn’t mess anyone up or confuse things - everything that is not master is simply something being worked on. A simple ‘git fetch’ will basically give you a TODO list of what everyone is currently working on.
``` 
$ git fetch
remote: Counting objects: 3032, done.
remote: Compressing objects: 100% (947/947), done.
remote: Total 2672 (delta 1993), reused 2328 (delta 1689)
Receiving objects: 100% (2672/2672), 16.45 MiB | 1.04 MiB/s, done.
Resolving deltas: 100% (1993/1993), completed with 213 local objects.
From github.com:github/github
 * [new branch]      charlock-linguist -> origin/charlock-linguist
 * [new branch]      enterprise-non-config -> origin/enterprise-non-config
 * [new branch]      fi-signup  -> origin/fi-signup
   2647a42..4d6d2c2  git-http-server -> origin/git-http-server
 * [new branch]      knyle-style-commits -> origin/knyle-style-commits
   157d2b0..d33e00d  master     -> origin/master
 * [new branch]      menu-behavior-act-i -> origin/menu-behavior-act-i
   ea1c5e2..dfd315a  no-inline-js-config -> origin/no-inline-js-config
 * [new branch]      svg-tests  -> origin/svg-tests
   87bb870..9da23f3  view-modes -> origin/view-modes
 * [new branch]      wild-renaming -> origin/wild-renaming
```
4. Open a pull request at any time.
>You can send pull requests from one branch to another , so you can use them to say “I need help or review on this” in addition to “Please merge this in”. You can continue to push to the branch, so if someone comments that you forgot to do something or there is a bug in the code, you can fix it and push to the branch. 

>If the branch has been open for too long and you feel it’s getting out of sync with the master branch, you can merge master into your topic branch and keep going. 
5. Since master is protected you will not be able to push/merge to master without opening a pull request and having it reviewed. 










