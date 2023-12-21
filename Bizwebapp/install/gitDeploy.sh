#!/bin/sh
echo "deploy start"
echo "shell exec example: ./gitDeploy.sh BizWebApp 155 kr/re/kitech/biz/zam/emp/dao/EmpDAO.java,kr/re/kitech/biz/zam/emp/service/EmpFileService.java"

export PROWORKS_HOME=/home/proworks
export PATH=${PATH}:/usr/bin:${PROWORKS_HOME}/extBin

if [ $# -ne 3 ]; then
    echo "[fail] check params!"
    exit -1
fi

echo ""
echo "Param info"
echo "1. AppName    : $1"
echo "   list: BizWebApp or EipWebApp or MbiWebApp"
echo "2. SR_NO	    : $2"
echo "3. srcList   : $3"

appName=$1
srNo=$2
srclist=$3

if [ ${appName} == "BizWebApp" ]; then
    echo "BizWebApp build"
elif [ ${appName} == "EipWebApp" ]; then
    echo "EipWebApp build"
elif [ ${appName} == "MbiWebApp" ]; then
    echo "MbiWebApp build"
else
    echo "[fail] check appName params!"
    exit -1
fi

echo ""
echo "remove deploy(-2day) directory"
find /home/proworks/resources/${appName}/deploy/ -mtime +1 -delete

echo ""
echo "create sr_no directory"
mkdir -p ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}

srclist=${srclist//,/$'\n'}
for src in ${srclist} ;
do
    echo "src: ${src}"
    srcPath=${src%/*.java}
    echo "srcPath: ${srcPath}"
    echo "mkdir -p ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/${srcPath}"
    mkdir -p ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/${srcPath}

    echo "cp -p ${PROWORKS_HOME}/resources/${appName}/src/${src} ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/${srcPath}"
    cp -p ${PROWORKS_HOME}/resources/${appName}/src/${src} ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/${srcPath}
	echo ""
	
done

echo ""
echo "register f/w meta"
#scmhttpsClient.sh ${appName} ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}

result=$(scmhttpsClient.sh ${appName} ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo})
result=${result:(-7)}
resultFailMsg=${result}

result_len=${#result}
result=${result:0:result_len-1}

if [ ${result} == "Sucess" ]; then
    echo ""
    echo "The file was moved to the was deploy folder(${PROWORKS_HOME}/resources/${appName}/classes)"
    echo "cp -Rp ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/classes/* ${PROWORKS_HOME}/resources/${appName}/classes/*"
    cd ${PROWORKS_HOME}/resources/${appName}/deploy/${srNo}/classes
    cp -R ./* ${PROWORKS_HOME}/resources/${appName}/classes

    echo ""
    echo "Sucess"
else
    echo ""
    echo ${resultFailMsg}
fi
