git init   // initialize git
git status  // check is changes are commited or not . if not commited then file name display in red otherwise in green if commited.
git log     // just show if commited or not.
git add .   // file name will turn in green because this will add file for commit.
git commit -m ' message '
git checkout hashcodetypehere   // this will checkout u r repository.
git checkout master
git remote add swabhav url.git
git remote -v     // -v is verbose
git push swabhav master   // this will push snapshot to github in repository.




If you ever edit versioned files such as configuration files that are usually shared but require a slight modification for your dev machine, you should consider excluding those files locally.

If you edit .gitignore the files in question will be ignored on every dev machine. You probably do not want that. Instead consider the following:

First add the files in question to the file at .git/info/exclude. This file is formatted just like .gitignore.


https://hashrocket.com/blog/posts/ignore-specific-file-changes-only-on-current-machine-in-git