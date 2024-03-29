package com.emerycprimeau.gameq.http.mock;

import com.emerycprimeau.gameq.models.transfer.GameCompletedResponse;
import com.emerycprimeau.gameq.models.transfer.GameRequest;
import com.emerycprimeau.gameq.models.transfer.GameRequestEdit;
import com.emerycprimeau.gameq.models.transfer.GameResponseAdd;
import com.emerycprimeau.gameq.models.transfer.GameResponseEdit;
import com.emerycprimeau.gameq.models.transfer.GameToCompleteResponse;
import com.emerycprimeau.gameq.models.transfer.LoginRequest;
import com.emerycprimeau.gameq.models.transfer.LoginResponse;
import com.emerycprimeau.gameq.models.transfer.LogoutRequest;
import com.emerycprimeau.gameq.models.transfer.LogoutResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServiceMock {

    @POST("login")
    Call<LoginResponse> toLogin(LoginRequest logR);

    @POST("signup")
    Call<LoginResponse> toSignUp (LoginRequest logR);

    @GET("gameToComplete")
    Call<List<GameToCompleteResponse>> getToCompleteList (GameRequest gR);

    @GET("gameCompleted")
    Call<List<GameCompletedResponse>> getCompletedList (GameRequest gR);

    @POST("logOut")
    Call<LogoutResponse> toLogOut (LogoutRequest logoutRequest);

    @GET("GameEdit")
    Call<GameResponseEdit> getToEdit (int gameID);

    @POST("GameEdited")
    Call<Boolean> toEdit(GameRequestEdit gameRequestEdit);

    @POST("GameAdded")
    Call<Boolean> toAdd(GameResponseAdd gameResponseAdd);

}
