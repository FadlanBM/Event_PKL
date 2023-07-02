<?php

use App\Http\Controllers\Api\AuthController;
use App\Http\Controllers\Api\EventController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/
// Route::post('register',[AuthController::class,'register']);
//     Route::post('login',[AuthController::class,'login']);
//     Route::post('logout',[AuthController::class,'logout']);
//     Route::post('refresh',[AuthController::class,'refresh']);
//     Route::post('me',[AuthController::class,'me']);


Route::group([

    'middleware' => 'api',
    'prefix' => 'auth'

], function ($router) {

    Route::post('register',[AuthController::class,'register']);
    Route::post('login',[AuthController::class,'login']);
    Route::post('logout',[AuthController::class,'logout']);
    Route::post('refresh',[AuthController::class,'refresh']);
    Route::post('me',[AuthController::class,'me']);
    Route::post('registermobile',[AuthController::class,'registermobile']);
    Route::post('loginmobile',[AuthController::class,'loginmobile']);
});

