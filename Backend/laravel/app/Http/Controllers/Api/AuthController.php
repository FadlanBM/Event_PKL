<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\User;
use GuzzleHttp\Psr7\Response;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

class AuthController extends Controller 
{
    /**
     * Create a new AuthController instance.
     *
     * @return void
     */
    public function __construct()
    {
        $this->middleware('auth:api', ['except' => ['login','register','registermobile','loginmobile']]);
    }

    /**
     * Get a JWT via given credentials.
     *
     * @return \Illuminate\Http\JsonResponse
     */
    public function login()
    {
        $credentials = request(['email', 'password']);

        if (! $token = auth()->attempt($credentials)) {
            return response()->json(['error' => 'Unauthorized'], 401);
        }

        return $this->respondWithToken($token);
    }
    public function register(Request $request){
        $validasi=Validator::make($request->all(),[
            'name'=>'required',
            'email'=>'required|unique:users',
            'password'=>'required|min:6'
        ]);

        if ($validasi->fails()) {
            return response()->json([
                'message'=>$validasi->errors()->first(),
                'code'=>400
            ]);
        }

        $user=User::create($request->all());

        if ($user) {
            return response()->json([
                'message'=>"bErhasil Register",
                'data'=>$user,
                'code'=>200
            ],200);
        }else{
            return response()->json([
                'message'=>'gagal registrasi',
                'code'=>400
            ],400);
        }
    }

    /**
     * Get the authenticated User.
     *
     * @return \Illuminate\Http\JsonResponse
     */
    public function me()
    {
        return response()->json(auth()->user());
    }

    /**
     * Log the user out (Invalidate the token).
     *
     * @return \Illuminate\Http\JsonResponse
     */
    public function logout()
    {
        auth()->logout();

        return response()->json(['message' => 'Successfully logged out']);
    }

    /**
     * Refresh a token.
     *
     * @return \Illuminate\Http\JsonResponse
     */
    public function refresh()
    {
        return $this->respondWithToken(auth()->refresh());
    }

    /**
     * Get the token array structure.
     *
     * @param  string $token
     *
     * @return \Illuminate\Http\JsonResponse
     */
    protected function respondWithToken($token)
    {
        return response()->json([
            'access_token' => $token,
            'token_type' => 'bearer',
            'expires_in' => auth()->factory()->getTTL() * 60
        ]);
    }


    // Api Untuk Mobile Android

    public function registermobile(Request $request){
        $validasi=Validator::make($request->all(),[
            'name'=>'required',
            'email'=>'required|unique:users',
            'password'=>'required|min:6'
        ]);

        if ($validasi->fails()) {
            return $this->error_400($validasi->errors()->all());
        }

        $user=User::create($request->all());
        if ($user) {
            return $this->valid_200('Berhasil Register',$user);
        }else{
            return $this->error_400('Gagal Login');
        }
    }

    public function loginmobile(Request $request){
        $validasi=Validator::make($request->all(),[
            'email'=>'required',
            'password'=>'required|min:6'
        ]);

        if ($validasi->fails()) {
            return $this->error_400($validasi->errors()->all());
        }

        $user=User::where('email',$request->email)->first();
        if ($user) {
            if (password_verify($request->password,$user->password)) {
                return $this->valid_200("selamat datang".$user->name,$user);
            }
            else{
                return $this->error_400("Gagal Login");
            }
        }
    }

    public function error_400($message){
        return  response()->json([
            'message'=>$message,
            'code'=> 400
        ],400);
    }

    public function valid_200($message="Success",$data){
        return response()->json([
            'message'=>$message,
            'data'=>$data,
            'code'=>200
        ],200);

    }

}
