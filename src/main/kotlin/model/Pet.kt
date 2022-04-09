import com.fasterxml.jackson.annotation.JsonProperty

data class Pet(
	@JsonProperty("id")
	val id: Int? = null,

	@JsonProperty("category")
	val category: Category? = null,

	@JsonProperty("name")
	val name: String? = null,

	@JsonProperty("photoUrls")
	val photoUrls: List<String?>? = null,

	@JsonProperty("tags")
	val tags: List<TagsItem?>? = null,

	@JsonProperty("status")
	val status: String? = null
)

data class Category(
	@JsonProperty("name")
	val name: String? = null,

	@JsonProperty("id")
	val id: Int? = null
)

data class TagsItem(
	@JsonProperty("name")
	val name: String? = null,

	@JsonProperty("id")
	val id: Int? = null
)

