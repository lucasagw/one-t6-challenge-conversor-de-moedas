package br.com.alura.record;

import com.google.gson.annotations.SerializedName;

public record ErrorApiResponse(String result, @SerializedName("error-type") String errorType) {
}
