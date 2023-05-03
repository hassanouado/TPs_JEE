import socket
import threading
listen = True


def receive_response(socketClient):
    while listen:
        data = socketClient.recv(1024).decode("utf-8")
        print("Response:===>" + data)

def main():
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(("localhost", 1234))

    receive_thread = threading.Thread(target=receive_response, args=(client_socket,))
    receive_thread.start()
    req=""
    while req.lower().strip()!="exit":
        req = input("")
        client_socket.send(req.encode())
    client_socket.close()
    listen = False

if __name__ == "__main__":
    main()