# homework

## 接口文档

```yaml
swagger: "2.0"
info:
  description: "This is a library server server.  You can find out more about"
  version: "1.0.0"
  title: "Swagger develop homework"
  termsOfService: "http://swagger.io/terms/"
basePath: "/"
tags:
  - name: "student"
    description: "Operations about student and article"
  - name: 'admin'
    description: 'admin operation about student and post article'
schemes:
  - "http"
paths:
  /api/admin/students:
    get:
      tags:
        - admin
      summary: 'get student list'
      description: 'admin get all students'
      responses:
        200:
          description: 获得用户列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: rename workspace success

  /api/admin/students/{studentId}:
    get:
      tags:
        - admin
      summary: "student info"
      description: "get student by id"
      parameters:
        - name: studentId
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
    delete:
      tags:
        - admin
      summary: "delete student"
      description: "delete student by id"
      parameters:
        - name: studentId
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得用户列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success

  /api/admin/students/status:
    put:
      tags:
        - admin
      summary: "change student status"
      description: "status post article change"
      parameters:
        - name: studentId
          description: studentId
          in: query
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            $ref: '#/components/schemas/Response'

  /api/admin/posts:
    get:
      tags:
        - admin
      summary: "post Article info"
      description: "get post Article info"
      parameters:
        - name: studentId
          description: studentId
          in: query
          type: number
          required: true
      responses:
        200:
          description: 获得用户列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success

  /api/admin/{bookId}:
    get:
      tags:
        - admin
      summary: "get Article Info"
      description: get
      parameters:
        - name: articleId
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得用户列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
    delete:
      tags:
        - admin
      summary: "delete article info"
      description: "delete posted Article"
      parameters:
        - name: articleId
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
  /api/admin/posts/public:
    put:
      tags:
        - admin
      summary: "change public posted artic;e"
      description: "change public posted become un"
      parameters:
        - name: studentId
          description: studentId
          in: query
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
  /student/{studentId}/books:
    post:
      tags:
        - student
      summary: "student post book"
      description: "post a public book"
      parameters:
        - name: studentId
          in: path
          description: "student id"
          required: true
          type: number
        - in: "body"
          name: "body"
          description: "order placed for purchasing the pet"
          required: true
          schema:
            properties:
              originContent:
                type: string
                description: book
              status:
                enum: [PUBLISHED, WREDITINGITE, RECYCLE]
                type: number
                example: "PUBLISHED"
                description: "PUBLISHED 1 EDITING(2), RECYCLE(3), DELETE(4)"
              title:
                type: string
                description: 文章标题
                example: "标题"
      responses:
        200:
          description: 获得用户列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success

  /student/{studentId}/books/{id}:
    get:
      tags:
        - student
      summary: "get book by studentid and book id"
      description: get
      parameters:
        - name: studentId
          description: studentId
          in: path
          type: number
          required: true
        - name: id
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
  /student{studentId}/book/status:
    put:
      tags:
        - student
      summary: "change book status"
      description: "change book status"
      parameters:
        - name: studentId
          description: studentId
          in: path
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success
  /student/login:
    post:
      tags:
        - student
      summary: "student login"
      description: "student login system"
      parameters:
        - name: studentId
          description: studentId
          in: query
          type: number
          required: true
      responses:
        200:
          description: 获得列表成功的返回值
          schema:
            type: object
            properties:
              content:
                type: object
                properties:
                  message:
                    type: string
                    example: success

definitions:
  Book:
    type: "object"
    properties:
      id:
        type: "integer"
        format: "int64"
      petId:
        type: "integer"
        format: "int64"
      quantity:
        type: "integer"
        format: "int32"
      shipDate:
        type: "string"
        format: "date-time"
      status:
        type: "string"
        description: "Order Status"
        enum:
          - "placed"
          - "approved"
          - "delivered"
      complete:
        type: "boolean"
        default: false
  Permission:
    type: "object"
    properties:
      id:
        type: "integer"
        format: "int64"
      name:
        type: "string"
  student:
    type: "object"
    properties:
      id:
        type: "integer"
        format: "int32"
      studentname:
        type: "string"
      nickname:
        type: "string"
      email:
        type: "string"
      password:
        type: "string"
      status:
        type: "integer"
        format: "int32"
        description: "是否禁止评论"
      expire:
        type: string
        description: "是否禁止发布"
  studentVo:
    type: "object"
    properties:
      id:
        type: "integer"
        format: "int64"
      name:
        type: "string"
  Student:
    type: "object"
    required:
      - "name"
      - "photoUrls"
    properties:
      id:
        type: "integer"
        format: "int64"
      name:
        type: "string"
        example: "doggie"
      photoUrls:
        type: "array"
        xml:
          name: "photoUrl"
          wrapped: true
        items:
          type: "string"
      status:
        type: "string"
        description: "pet status in the store"
        enum:
          - "available"
          - "pending"
          - "sold"
  Response:
    type: "object"
    properties:
      code:
        type: "integer"
        format: "int32"
      type:
        type: "string"
      message:
        type: "string"

```
