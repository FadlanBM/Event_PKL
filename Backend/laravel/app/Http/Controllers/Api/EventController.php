<?php

namespace App\Http\Controllers\Api;

use App\Models\Event;
use Dotenv\Validator;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator as FacadesValidator;
use Spatie\FlareClient\Api;

class EventController extends Api
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create(Request $request)
    {
            $validasi=FacadesValidator::make($request->all(),[
                'uraian'=>'required',
                'tujuan'=>'required',
                'tanggal'=>'required',
                'waktu'=>'required'
            ]);
    
            if ($validasi->fails()) {
                return response()->json([
                    'message'=>$validasi->errors()->first(),
                    'code'=>400
                ]);
            }
    
            $user=Event::create($request->all());
    
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
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(Event $event)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Event $event)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Event $event)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Event $event)
    {
        //
    }
}
