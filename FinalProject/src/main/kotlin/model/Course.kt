package model

class Course(var code: String, val name: String, val credits: Int, val module: Module) {
    override fun toString(): String {
        return ("Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
                + module + '}')
    }
}