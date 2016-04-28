@echo off
echo Compiling API module...
echo javac -d ../out/production -modulesourcepath . -m org.example.module.api
javac -d ../out/production -modulesourcepath . -m org.example.module.api

echo Compiling implementation module... 
echo javac -d ../out/production -modulesourcepath . -m org.example.module.impl
javac -d ../out/production -modulesourcepath . -m org.example.module.impl

echo Packaging API module jar...
echo jar --create --file ../out/org.example.module.api.jar --module-version=1.0 -C ../out/production/org.example.module.api .
jar --create --file ../out/org.example.module.api.jar --module-version=1.0 -C ../out/production/org.example.module.api .

echo Packaging implementation module jar...
echo jar --create --file ../out/org.example.module.jar --module-version=1.0 -e org.example.impl.Main -C ../out/production/org.example.module.impl .
jar --create --file ../out/org.example.module.jar --module-version=1.0 -e org.example.impl.Main -C ../out/production/org.example.module.impl .

echo Running...
echo java -mp ../out -m org.example.module.impl
java -mp ../out -m org.example.module.impl