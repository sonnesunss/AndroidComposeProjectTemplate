# 这里放置数据层的内容

    + Repository interface + impl + di_helper
    + DataStore
    + Room(Entity, DAO, customDatabase)
    + useCase
    + Domain model
    + Util(entity <-- type converter --> domain model)

> Room entity定义不应该直接暴露给使用者(useCase or ViewModel), 应该使用领域层内的模型间接暴露出去