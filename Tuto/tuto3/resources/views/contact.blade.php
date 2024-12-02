<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contact</title>
</head>
<body>
    @if (session('success'))
        <p>{{ session('success') }}</p>
    @endif
    <form method="POST" action="{{ route('contact.send') }}">  <!-- Updated route -->
        @csrf
        {{-- name --}}
        <div>
            <label for="name">Nom: </label>
            <input type="text" name="name" id="name">
            @error('name')
                <p>{{ $message }}</p>
            @enderror
        </div>
        {{-- email --}}
        <div>
            <label for="email">Email: </label>
            <input type="email" name="email" id="email">
            @error('email')
                <p>{{ $message }}</p>
            @enderror
        </div>
        {{-- message --}}
        <div>
            <label for="text">Message: </label>
            <input type="text" name="text" id="text">
            @error('text')
                <p>{{ $message }}</p>
            @enderror
        </div>
        <button type="submit">Envoyer</button>
    </form>
</body>
</html>