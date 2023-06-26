/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],
  theme: {
    extend: {
      fontFamily : {
        main : ["Poppins", "sans-serif"],
      }
    },
  },
  plugins: [],
}

