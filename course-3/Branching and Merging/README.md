# Skill Description:

Develop foundational expertise in Git, covering version control basics, branching, collaboration with
remote repositories, tagging for versioning, and handling ignored files and temporary changes.
Additionally, explore Git hooks, GUI tools, and the Git Flow workflow for advanced version control
strategies. Gain hands-on experience to efficiently manage code changes and collaboration
workflows using Git.

## Problem Statement 2: Branching and Merging

 Create a feature branch for a specific enhancement in the project.
 Make changes in the feature branch and merge it back into the main branch.
 Resolve any merge conflicts that may arise during the merging process.

#### Learning Outcomes:

 Grasp the concept of branching in Git.
 Execute changes in a feature branch and merge it back to the main branch.
 Resolve merge conflicts if encountered.

## commit history

PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git commit -m " Branching and Merging "
[main 8ee7e93] Branching and Merging
1 file changed, 19 insertions(+)
create mode 100644 course-3/Branching and Merging/README.md
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git push origin main
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (5/5), 869 bytes | 144.00 KiB/s, done.
Total 5 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To github.com:TharunPatel20/UST-techAcademy.git
e9fc022..8ee7e93 main -> main
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git add .
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git commit -m "main branch commit"
[main 25e842b] main branch commit
1 file changed, 11 insertions(+)
create mode 100644 course-3/Branching and Merging/main.html
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git branch feature
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git branch
feature

- main
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git checkout feature
  Switched to branch 'feature'
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git branch
- feature
  main
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git add .
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git commit -m "Feature branch commit"
  [feature 33712b0] Feature branch commit
  1 file changed, 11 insertions(+)
  create mode 100644 course-3/Branching and Merging/feature.html
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git push origin feature
  Enumerating objects: 13, done.
  Counting objects: 100% (13/13), done.
  Delta compression using up to 8 threads
  Compressing objects: 100% (10/10), done.
  Writing objects: 100% (10/10), 998 bytes | 99.00 KiB/s, done.
  Total 10 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)
  remote: Resolving deltas: 100% (4/4), completed with 1 local object.
  remote:
  remote: Create a pull request for 'feature' on GitHub by visiting:
  remote: https://github.com/TharunPatel20/UST-techAcademy/pull/new/feature
  remote:
  To github.com:TharunPatel20/UST-techAcademy.git
- [new branch] feature -> feature
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git checkout main  
  Switched to branch 'main'
  Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git status  
  On branch main
  Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git merge feature  
Updating 25e842b..33712b0
Fast-forward
course-3/Branching and Merging/feature.html | 11 +++++++++++
1 file changed, 11 insertions(+)
create mode 100644 course-3/Branching and Merging/feature.html
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git status  
On branch main
Your branch is ahead of 'origin/main' by 2 commits.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git branch
feature

- main
  PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git commit -m "merging main and feature branch"
  On branch main
  Your branch is ahead of 'origin/main' by 2 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
PS C:\Users\Lenovo\OneDrive\Desktop\UST techAcademy> git push origin main
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To github.com:TharunPatel20/UST-techAcademy.git
8ee7e93..33712b0 main -> main
