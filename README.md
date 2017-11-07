Access http://localhost:8080/test(specified path in build.gradle)


###3 Github upload and clone
git init

git config --global user.name ''
git config --global user.email '@gmail.com'
git config --global color.ui 'auto'

git remote add origin https://github.com/PKPKrishnan/test.git

git pull origin master

git add -A
git commit -m "comments"
git push
