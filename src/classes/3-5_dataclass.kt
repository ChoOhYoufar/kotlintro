package classes

/**
 * @author cho.oh 2018/07/27.
 */
//データクラス
//データを持つクラスには、data classを使えば必要なメソッドは自動で生成されるので便利になる
fun makeDecorations() {

    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    //false
    println(d1.equals(d2))
    //true
    println(d3.equals(d2))

    val d4 = d3.copy()
    println(d3)
    println(d4)
}
data class Decorations(val rocks: String) {}

//業務はよくhibernateのentityとして使うことが多い
//@Entity
//@Table(name = "images")
//data class Image (
//        @Id
//        @Column(name = "IMAGE_ID", nullable = false)
//        val imageId: Long,
//
//        @Column(name = "CORPORATE_ID", nullable = false)
//        val corporateId: Long,
//
//        @Column(name = "ASPECT_RATIO_TYPE", nullable = false)
//        val aspectRatioType: String,
//
//        @Column(name = "IMAGE_FILE_TYPE", nullable = false)
//        val imageFileType: String,
//
//        @Column(name = "S3_KEY_PREFIX", nullable = false)
//        val s3KeyPrefix: String,
//
//        @Column(name = "DELETED", nullable = false)
//        val deleted: Int,
//
//        @Column(name = "DELETED_BY", nullable = true)
//        val deletedBy: Long?,
//
//        @Column(name = "DELETED_AT", nullable = true)
//        val deletedAt: Timestamp? = null,
//
//        @Column(name = "UPDATED_BY", nullable = false)
//        val updatedBy: Long,
//
//        @Column(name = "UPDATED_AT", nullable = false)
//        val updatedAt: LocalDateTime
//)