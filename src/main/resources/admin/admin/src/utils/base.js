const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot05127/",
            name: "springboot05127",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot05127/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "卓越导师双选系统"
        } 
    }
}
export default base
