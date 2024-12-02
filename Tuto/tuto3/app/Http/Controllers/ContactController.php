<?php



namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Mail;

class ContactController extends Controller
{
    public function showForm()
    {
        return view('contact');
    }

    public function sendEmail(Request $request)
    {
        // Validation of form inputs
        $data = $request->validate([
            'name' => 'required',
            'email' => 'required|email',
            'text' => 'required', 
        ]);

        // Sending the email
        Mail::raw("Nom: {$data['name']}\nEmail: {$data['email']}\nMessage: {$data['text']}", function ($message) use ($data) {
            $message->to('bozidia048@gmail.com');
        });

        // Redirect back with success message
        return redirect()->back()->with('success', 'Bravo! Votre message a été envoyé.');
    }
}