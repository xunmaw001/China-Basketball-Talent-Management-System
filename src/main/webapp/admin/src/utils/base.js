const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmna5js/",
            name: "ssmna5js",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmna5js/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中国篮球人才管理系统"
        } 
    }
}
export default base
