const { exec } = require('child_process');

const getCommand  = v => `docker run --rm -v "${process.cwd()}:/local" openapitools/openapi-generator-cli generate \
-i http://192.168.1.67:4090/api-docs-json \
-g ${v} \
-o /local/${v}`;

const arr = [
    'android', 
    'csharp-netcore', 
    'go', 
    'graphql-schema',
    'java',
    'kotlin',
    'php',
    'python',
    'ruby',
    'typescript-axios',
    'wsdl-schema'
]

arr.forEach(v => {
    const command = getCommand(v);
    console.log(command);
    exec(command, (err, stdout, stderr) => {
        if (err) {
          console.log(err);
          return;
        }

        console.log(`stdout: ${stdout}`);
        console.log(`stderr: ${stderr}`);
      });
})

