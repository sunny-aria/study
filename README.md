# git 常用命令
* github create respository name
* 1.git init
* 2.git config --global user.name "sunny-aria"
*   git config --global user.email "sundf_good@163.com"
* 3.git add file1.txt,file2.txt,file3.txt
* 4.git commit -m "message"
* git add命令实际上就是把要提交的所有修改放到暂存区（Stage），
* 然后执行git commit就可以一次性把暂存区的所有修改提交到分支。
*     第一次修改 ->  git add ->  第二次修改 ->  git add ->  git commit
* 好，现在，把第二次修改提交了，然后开始小结。
* 现在，你又理解了Git是如何跟踪修改的，每次修改，如果不add到暂存区，那就不会加入到commit中。
* 5.git remote add origin https://github.com/sunny-aria/javaStudy.git
* 6.git push -u origin master
* 第一次使用 -u 后续可以去掉-u
* 7.git diff
* 8.git status
* 9.git log git.txt
* 10. git log --pretty=oneline git.txt
* 如果输出的信息过多可以使用--pretty=oneline
* 11.git reset --hard HEAD^
* HEAD^ HEAD^^ HEAD~100
* 回退版本
* HEAD指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令git reset --hard commit_id。
* 穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。
* 要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本。
* 12.命令git checkout -- readme.txt意思就是，把readme.txt文件在工作区的修改全部撤销，这里有两种情况：
*    一种是readme.txt自修改后还没有被放到暂存区，现在，撤销修改就回到和版本库一模一样的状态；
*    一种是readme.txt已经添加到暂存区后，又作了修改，现在，撤销修改就回到添加到暂存区后的状态。
*    总之，就是让这个文件回到最近一次git commit或git add时的状态。
* 13.场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。
* 
*    场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，
*    分两步，第一步用命令git reset HEAD file，就回到了场景1，第二步按场景1操作。
* 
*    场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。
* 14.命令git rm用于删除一个文件。如果一个文件已经被提交到版本库，那么你永远不用担心误删，但是要小心，
* 你只能恢复文件到最新版本，你会丢失最近一次提交后你修改的内容。
* 
*  另一种情况是删错了，因为版本库里还有呢，所以可以很轻松地把误删的文件恢复到最新版本：
*  $ git checkout -- test.txt
*  git checkout其实是用版本库里的版本替换工作区的版本，无论工作区是修改还是删除，都可以“一键还原”。
* 
*  15.Git鼓励大量使用分支：
   > 查看分支：git branch

   > 创建分支：git branch <name> 

   > 切换分支：git checkout <name> 
   
   > 创建+切换分支：git checkout -b <name> 
   
   > 合并某分支到当前分支：git merge <name> 
   
   > 删除分支：git branch -d <name> 
   
* 16.git pull origin master 
* git pull <option>  <branch> 
* 17.修复bug时，我们会通过创建新的bug分支进行修复，然后合并，最后删除；
*    当手头工作没有完成时，先把工作现场git stash一下，然后去修复bug，修复后，再git stash pop，回到工作现场。
* 18.开发一个新feature，最好新建一个分支；
*    如果要丢弃一个没有被合并过的分支，可以通过git branch -D <name> 强行删除。
* 19.设置 .gitignore 忽略该忽略的文件   vim .gitignore  设置忽略规则
*  git config --global alias.st status  设置别名
