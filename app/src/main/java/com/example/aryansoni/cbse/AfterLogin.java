package com.example.aryansoni.cbse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterLogin extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(AfterLogin.this,AllClasses.class);
                startActivity(i);
                /*
                on. All rights reserved.

D:\Project\FirbaseStorage>git status
On branch master
Your branch is up-to-date with 'origin/master'.

nothing to commit, working tree clean

D:\Project\FirbaseStorage>git branch -a
* master
  remotes/origin/ClassScreen
  remotes/origin/HEAD -> origin/master
  remotes/origin/TryingFastAdapter
  remotes/origin/master

D:\Project\FirbaseStorage>git branch -a
* ClassScreen
  master
  remotes/origin/ClassScreen
  remotes/origin/HEAD -> origin/master
  remotes/origin/TryingFastAdapter
  remotes/origin/master

D:\Project\FirbaseStorage>git status
On branch ClassScreen
Your branch is up-to-date with 'origin/ClassScreen'.

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        new file:   app/src/main/java/com/example/aryansoni/cbse/AfterLogin.java
        new file:   app/src/main/res/layout/activity_after_login.xml

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/modules.xml
        modified:   app/src/main/AndroidManifest.xml
        modified:   app/src/main/java/com/example/aryansoni/cbse/AfterLogin.java
        modified:   app/src/main/res/layout/activity_login_screen.xml


D:\Project\FirbaseStorage>git add .

D:\Project\FirbaseStorage>git commit -m "Created AfterLogin activity.Now add NCERt,Old ques paper,Miscellaneous,Settings list"
[ClassScreen 6f08329] Created AfterLogin activity.Now add NCERt,Old ques paper,Miscellaneous,Settings list
 5 files changed, 57 insertions(+), 7 deletions(-)
 create mode 100644 app/src/main/java/com/example/aryansoni/cbse/AfterLogin.java
 create mode 100644 app/src/main/res/layout/activity_after_login.xml

D:\Project\FirbaseStorage>git status
On branch ClassScreen
Your branch is ahead of 'origin/ClassScreen' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

D:\Project\FirbaseStorage>git remote
origin

D:\Project\FirbaseStorage>git push -u origin ClassScreen
remote: Permission to Bloodevelopers/FirbaseStorage.git denied to aryansoni1108.
fatal: unable to access 'https://github.com/Bloodevelopers/FirbaseStorage.git/': The requested URL returned error: 403

D:\Project\FirbaseStorage>git push -u origin ClassScreen
remote: Permission to Bloodevelopers/FirbaseStorage.git denied to aryansoni1108.
fatal: unable to access 'https://github.com/Bloodevelopers/FirbaseStorage.git/': The requested URL returned error: 403

D:\Project\FirbaseStorage>git push -u origin ClassScreen
Counting objects: 18, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (14/14), done.
Writing objects: 100% (18/18), 2.16 KiB | 551.00 KiB/s, done.
Total 18 (delta 8), reused 0 (delta 0)
remote: Resolving deltas: 100% (8/8), completed with 8 local objects.
To https://github.com/Bloodevelopers/FirbaseStorage.git
   cf97e63..6f08329  ClassScreen -> ClassScreen
Branch ClassScreen set up to track remote branch ClassScreen from origin.

D:\Project\FirbaseStorage>

                 */

            }
        });
    }
}
