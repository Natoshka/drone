insert into drone_model(id, name)
values (1, 'Lightweight');
insert into drone_model(id, name)
values (2, 'Middleweight');
insert into drone_model(id, name)
values (3, 'Cruiserweight');
insert into drone_model(id, name)
values (4, 'Heavyweight');

alter sequence seq_drone_model restart with (select coalesce(max(id), 0) + 1 from drone_model);

insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (1, '1234567', 4, 500, 100, 'IDLE');
insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (2, '6996', 2, 500, 80, 'IDLE');
insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (3, 'g63333', 3, 500, 90, 'IDLE');
insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (4, '009890', 4, 500, 50, 'IDLE');
insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (5, '54678', 3, 500, 24, 'IDLE');
insert into drone (id, serial_number, model_id, weight_limit, battery_capacity, state)
values (6, 'hj8906', 3, 500, 100, 'LOADED');

alter sequence seq_drone restart with (select coalesce(max(id), 0) + 1 from drone);

insert into medication (id, name, weight, code, image)
values (1, 'Citramon-P', 10, 'ZL001', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8BOImXlcSiqckDV7mMqksvKdS8QvTI9s7H5Dfa6ajJvVEeFVO6ZdhZz5UGaBYzgGUugGn7b7QHx+EHeNXoyo4j0Tp4Af+Gl4i2s8ID+00UQjHavH35avOcr+XjWf8jHM9XnsEUL5jgaoiIktC4dG3JiM9Y1ew1V8KpfnffI0jiJr/nwnn6h8P6ggX4Dr+CttW+Ql5AmQJ/gGRVJVIB6xO/vHF9as0djYaCNTW1e364wvuwJSZl+oQ8b9LXXWVSizZNn1tZgI06K8JFMCpG/bFbfhzcdG1+PF3wd5eFvypSyEUMBD/HhEKfi/sDtcX+Mk4LC1hMacAEUc2Gjw+dMMx3PveONkv6WSkLxMTFArFq8/6uPani4lNAYTVLgfPRZ0vS0lNXZ7LA4QgnswbNUJZzH73c3ERgwkqaPcx0nN854wZlPTy9Bm8F9xo5JKzAtu4Vcb6ZfpdTwCK31R9HuVkCbC80gFIBm6VB6VJO0z9Z112o1ryAM5FdVAJXqXuaWMvyxX2Nl3Wsf4EJVs0H+vNrSxYYgFZ0AfHHu1x5qEuwD3f39ibJznzjtJltAEApasAqQWWFjyQa8jQAFStFRrKNq6pN8GBKCPQpKamX6kYPsiRlInyhskIdSKyOSI05p2KsvxWQSazqpkHAQGTFvnyp+eNYOc5Y9gTlHDUBBR7N1yeCoufDTMsuW1/GCzoNvIsKlVDxWAc5ex950IEsY6EnlJn+ZK51BiKVwf5wMxc/CrTkmFnyjYCH8Xeci6k8VnKW9/sw8kQmSjTJr/BALtT7Jf682ei1cTVMzCBah8Bd7hxtEGpeILHIIEzO0233FDiN9InD3nlBxAq1wEt5gGhm8ZMIQYQhzAxVaUSQ5AxPaTW9+VLypgsk/o77gySFgnBcmEmg7Sf3DXLHoESGv8An1m3Bu5HnvbvxakSxuDzSjrPwo2CxE/bXuydKTErqQ3Pt6uPw/AzUkOibnYIf9WuAAflp8WNw9TU/SWqyDrw8fgcFs009cUjxERgjYdq6UmfdfYx5lEI2bn3pXhDdvct4wEAAP//4xF+NC9zwwgAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (2, 'Naftizin', 100, 'LK00-4', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8A+k7NzsNLfzDAa8nQqY4dlAbZjFMFyv9CndBsWsWuOTZ0m75ekK2jIvgfJrsAT714gAVL85CK5NEPDY7YwHTKlUjuE+PP6T4ho5MH+PuzOlYPkao4emNRUlUB0l0lOULoUYDPHy+NG1WtvHq09MBbr/0dTJtstqHZor8RN5Q492eqtLDHPy8buwAQDdEpduA2vnvA1/BpTIB0h4qmfG2pj4xUQ0ihORB2vcmoKykgmiSzTUGGwmxAL/AtNNee29VGtfG3wHK/Tr9lsG1KdA/ScYA+3Nm8eKQ17S0NB+U6gQP1bIEb5k8+sgPjmw8BMDsrkQjIvoBNYoQ15nAwJKgoNEKp5pNrz34e+CAgQrwctRPHSXt7vTeNMa4Lur54QaJc1Y2qVm5AZDMo+x1dkPVbABI+lUw+6bduicD5M4XyqtUYCr963VCB+gEPdslfgPhbLRe8Qb7PgLxmdO+4/oKAiHuTxd1r7hoAR8UY7U/rXPjfczc1U8JDizjx/A2UDbsxjPg7+eg8lwDbARPiXxWZlAL0VYWRYQG008xDPZEqwXnW8UhC+1A6UhQ2i+evR0L1QzpvRHvGBLeADyxeqzmgRPpUFQS18o8K50bD1atExkk9Px8ANIfmAsFwC95yTRtg532zHrqE259xgATCORoQKfmoeyw7HQ+xqMGWLPwnRIakRVJYIGs12eQr9H0orUSCUCc7vk7BvElnrUB2W3jh8pH4tM0Pnona5tIJuz5PjV8i6XCbomg0wfbFdUgPVqcoyq229GN9ungNi/pADvW8hGm5IaKK9E5F3sUn+sGAQuiLDmc7W5b2Ox9bTCVQ5djIchMomAYMSVh39g6BQOutkul9qskCO3+Pph84eWwV3gcTO1eB3+U6NVqQYIHaWjBZwsfWEcb0FGN+sjqAfkBqqUpHrWspKv4s8hDSf05PjY9X/VQb3v5MNUm/NZ9vajIfL9yEZapGwMjNQMJZb/WAQZ9fB8fNr03jHA6Ehg5kZTxULBn1HGgS+p0SdwTiQD4jV7pClwMClbBnl4VQ0uP6wEAAP//uoF9CqFq+oYAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (3, 'PatronP', 150, 'jjk', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8ArZzKDiOENyg5b5NcqDvvpj0TPA1rWMJ7Eh9Z6l6+1Ui+uBbJY/kI0/l/Nu6Aoe0JAB5RuFcJa5w49tXGa3Vb/48ueBifQXvofVIAF0dHjLC7WSI+JI7UAK6DYRNOAyvI4kCH6sDGm/YVWkiI3QsVPS4amm4YU2xKYBr4kwhlhGv4GWo3eonGP8/QVeMJeXkEJ7tAO1d7FGv9/l11dFCeiHXUxyl5A8CZ0iTZy4kYML8v2XejFLj/oLIG2lapRLL/HjjswPsBzgBxj+aHWknDT8GZ4apcSMI3xj9Eh9yvK4h2Ko0vNmVhXsp0ZvIUNINp/I+lmYCo3oov9dDAyfuftdQ4tu0uaH9lyeIFDI9y/Iz3IDHSL90gZPLJ0p05hbeSuOVpwKzATUcWYaD9pwbqVbxKbkWWlVlqPWR8bAOux670Lna9FjUJSfaHiw4Mv0JdplvMOIF8AQSGQL7TAjyiyHg2PEtKSX3qNc70x/wVBF6pMiMTRn65gmOlcLky4IRBQO4fFn1N6UA2a/I7Qnic/TlCMjRl8AWI+kUGVkeIewPrigQEvIc1PYcSdqkcY8Hjwi3jLlDRPboA4E/5LUe3ufmYR+bKBC4asDUIJ/BvoZkHvCsEB3RYHgyKn7cIuo3XY4aeXA26ecz+gC1T7EmABVRET37TRojrAO301PueW1vhZDnfqx88+BDuO32wXDxK7kFHGYIYnGnRN0AsMmWQBa5Qui8RJBGEcwh2GJ1mudOSUrHP9o4HsTF2Ohg8UDOCwMz19mNj+vfR3mUA6bSEz5QxempwSUq7KTcsIBeB6VlxyWbTlMxccDsgKfs1yAhdvd20uOud3azltD6aQE1twNw10dwP8MYunfLav2rMIX/TqJr1NQ0wMJ14LgolwCUFjCK/xe0D/KBCynKe/YAw7rMtgVvkvGHr8PRK2mHsuQopLwixr55zxotYOsLcaRKL6XttfadJv4YmL+z4BH0Aor8pAjwKhwDMglhNzZNTqCfxz64JM2lXp9qooyZBT2UnRE4Td0MticnJyTkCeF3+QEAAP//Y96DVySt4HoAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (4, 'CValentinC', 501, 'Zf567', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8A9dGzhj7uAm9u6MBrvrtf20lBnkaM7vIvxTLr4b8/iiAfF42r5YU4hPGV++BtVIauAPFGKDa8LvI/wsNSKvgb+YIUIsSDbzklnmhZLf4Q/PGZ2e4T/D8SL26xbR2LfV9NuUDkp5i9nWj7gzrhvucxhDk6cQ01rUeTgcAPqlJdCbODjukKa8gGKjPKeCQBR54X/jTACfSZt7kYQalbi2+2BssrlS2HwEwoI9h8Ch2XOA/xuUEov21wXtNlyAhaWpbPzT6xQOp85SoO0nKUukLE3fN9b13hNq8wRQGLPWkIkUKVWWQ7UYSACMafRO6GlkfvCXtra8B3X1+HdW/TDJfLDMypvXtvNf+xPXj7Nn87pSwWi8DL69JCYBAuE88qlsW377IbfWgAB9sAJOvYIHmC6Z9UdfGw4AbI+XPar3D58vxAnx7X/x2HTXd0RPR9QXc58m/29aaZwHUtz0vR618YJ4+PFgS1+IZubT8L+Tu/sRn7EJyCt3TszjkoOyqm+WCuPkLApwEFTkB4yu7kBFVEIWSVoLJ1a0rjQRRV/AV0ngQ9kirNvdE3fsg+YKHWA+KsQiAi2s6fPdKAuAytMPLFVsI/++fIuRkAdQKk57cDs4Ljub9kIioggTXSbbYxKRYmJvuW7BIJzOxXwG32VhgnlZre9oRlkCC43J9yC9LFywxg+CHAdmVVXfZ9osXB4r4seJ67yflq6XkSMADRMXpAc37DT+IwYJDQbP21MwmZgmMaT8DKtGaT/jCscqQz9MO7jqLxgW8iTKf7NgVAAei9h33oz9RzkPPLg1O1WNutpg+IRjYunYJcM3Wn4ZK6j1TENN7UaePtIdJG/bSDQCbBBHsa+azdBLT5YW+75sN/mPvxppdCdgUsq9jP86/qyBMw5QG+jY3CMk9EhfEr4kD2NF8XhisBUuvp83EvVE1NSSywQBNIWxI/f0+6mia0iLC5u4PWb7HtBksqwly9i7sAE70c6VtGlu+6NZUX8O8Ft0YJSR5dhm8RVegO+tq4MYAvd+Vm/mn2248NhGbvW5L6wEAAP//zweM+M/urr0AAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (5, 'HandCream', 150, 'bbft7', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8A0pqEhrmE1eFHUiK4Rx/N014KFroNh5dFBwX2YqllzR38Mx6jnIc/gTM87PjWtus7wQEyqa6kws9jV24MMpEPwH7QSomn/RG/9X957cTvANetJS3yurXINuIdABSBhY2AyoAYNk4pM9SAvW76YckuFq4fWU5ci9tCQAXbG/ojz8jApZTQ2LbHzv9DwxAmyRN44UzAdnf/qTL+SoLNUUqQhtu4KeEhJTswULSDwhvuXHZK8XL/pqCJoeZ3XVTLjLUEh2UTwEAgW0zhuWqDCU46Fmw9osr5wPZlBUPoDnJClpqDH7cylMEBlMjc/5WblJG7RLj5xMDSyJElFtyItZ6Gy7Ns4MO+AcNNrTKZC3ihyjHIAnw9+ko340dpsYyF32M92w8MSeQAMLG0pFyy9n2ls+H/ii422t3RDcUI6/T/dlg60QaRFAXbtwjgX9pb7UtGpGrtfszOgRy13/fIC76klC++f2a78kkb3wkzqwOdJ3DdJVPvCF+kwDyjVbk6B68Yrr5DxwtsfEEEYl/NPdkXUbrxxGdVPDfXxJhqc59SrCvTq2P6CLcUdZJm9BcFutBrS3sNvsFPR8aAyqu5xkZ0g2Fpj/ZPHNMTLQWEPUG81NDKCG9rj7Et0S0uuLyL8UopUxFPMTQ/qi3uQOA/7fpPtiJGfZyGvj046KPA2rq3NuEdPVgCus88UifzG0Ry/l5QqekDyyDpQEzytEAIMXMrEyy3KMYHUXIj+7e2Zo3xPEcacK43lku4ifLdJl3y2fy+lsDbNYuXQrSBNB9AWrgrOimwjno/bcn6plhEViHXiIPgrkfEbYoh47PEIfUdQcxDgerNIorYnQZqeycJwHjUtwDny1by/BFCgOTs3u4QQEefF7DvhqKjgFGeOiYVbtYFdRO9g5/Eh4Ne0RZnNoArSSJGuSaQOrE2g2IkAwIIOFUn+7Q6GizhBDV8O7t7TgMiPfZAw8kBDLhKjUasDiBAdygC1Mcxtf6G70Ho1r7RxyXrK4zlFUVpaciKNigZvVEQAoBC4y5e62Tho80Fzdx7AEAAP//LLtzzGiapeYAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (6, 'Lip_balm', 50, 'fgfjyfyj', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8AgFTchFv33EIEQUtqMd23yb2BhlLr9uYngKFvnmbM5rP5vVOo+dbTfbM92nlmCeCjATODfzq9smKyMTU5oo2tNRZWW8ZpHs+Zu4ziCP/sloXhKhz+4DkU7e3JiUS7FuTMNsDpk+sj9+qCbbN6UXWc6w50/IXiSaFKhzuT0+Vrxj393yonCPM8BhvS4ZZSTej4zOZAWrJ82YhrHHqYxTMJGQS3gIhjHiAmprrxCu33x9WE7t6p53i/C3pC/I/98yZh6mbKAB73x6RSzH8B4HoA2o7rWgQlr4oHQpU6H1IPy3y7rK0OQmb0mu+T9KMofnYpV1GzRsC8ad3X/1WXqCadxlfSWzRWKa6GkEQDCgeGnsnGeDL4aHYes0L8Ztm3b/Yl5XUjrSNALzbjSpD6TOOAQmsO5aY/TOVUhHv4PVEnasXNqeGLfI/e+t/nUtRWtrMboAXC3KcYgJzop4d/YF5Ft4uwQImMSj+WYfZ3bC4BkXpVvruuKwok65RPXoWvOk5xDQcFvqE23UDAWyNOv9tL+5wnpk41GdtYCn2lvBw64YKZbUb7OHEAJmavD9zxOwxI+TH06Hq2Vz+AXf8SRmYyka0YP9S8olXTCmrCRIJu6o7CQM0Q4vw6hSKa6ZJnss26bP6sbQURlZWAwRJ/ypRh7k4VPrBOT1gfdnfVGH0Iywztk/3qEgVjcbE6dOjcB/Vev6qxDIdr3xYBPwChSJKbM4k8MeiGso3BeBy+1ebOxvBJjXu7A8U/a925CURjuDNyuH6tHPssWX1WCyRBDat183H7SZEu0zfpqNEPfihKD14kvRElW1BQNOj77pPkek4FbkOl/3u9UPUx8LQNQD76SlY6c99zv4zKFzME7KwfjtHlJJ/IxMlKPqOmiY7xQI04eGZjbd0X9UcKAikMGkCMIFzX8YQbosk+xV3twf5QVbcDr/7bB1ht4YR4n4xSDnPFgDwKC2YJShEfSHf1P4hAEfYBuuISVhAtdYI3ZSi+wED5WqGMyi5SJEJBzb53ZwKhMjOqHPUg/gxdfNKWp4ZJgEAAP//HryGecVFKAIAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (7, 'glasses', 90, '9999', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8BF9kjm/TgdpmP9zVcwY9tB/9SiGXz9C6CUsPiGjW6hUQJAJnQTHPoyPFOgF45hpLuAROEtschVhQx+KeRXvhjhoAaxFM4KgfVwRYog4XR3k5xhKN9/c82BAoJCiEGrmU2fwCKfLN9z0BHaIDZ7DB4lUH/izfKiU4gK8gW3CR/WlPje0cBsW6JjZ0vmCUPOM/YsZEAGXtAMuH4z5O5kLoJPyiDAbMFARGw0zLC0aL5NGLty2dz8pLtD/xNXThdiFXuLNAWQOYIurzhz6V+dtVD/OA9Y8zr/NX6xemnJXlkzPWO0Cj1rLFJ/53QEktRXGFAAsSJ1cAzJuIOIpXb6CfFRg4EZjgM9hX7DV0rwS94St2M1v2dS4fNp6h7jYA/QM74Tt3KiWJBJ3y7wIvkOa5ifUw0yVEuWzXHFFUEyv1S83zNVWt2wEOHmENMOTD3Gxz1BMU3sFgzgHmH0ImAwCq8VNoBgxpmtYk7IPEiXJssNqCz3LoB3Es/hielTe9B3mxV/wGYyAN3cMBl3O+z3E+bxqRsredqd+d8HnRn1Ks9Svc79YiA4bbEaU1W475Aq2Ry0L7synY3TJ3ANfWWfX19Fg7UqdxIA7wIoS/FEqZK389rwvB8RmwSenEJa5VOl5btvPuE3elK6VIEwSjeyJKpCyBs69UIL8vWtIi1OLf35MDcAi1C0MaPIaBHQLuMAAVNieQIKTq4oZs3NkE24wSKU78OYsZ43Hg3OwLLklcIoyN6Vo2zze8MvX42ag2FaokvCFMS+jNugzQFK7hAGWY0EGdgC3zVqwVmmS34DskUPgjwS0G/oNOBjoeuqExqGmaLx4sI9kQpy5lvlkUEgAZbyszhqHBluDtpeJhcUoKAAEqTa2zFHTwBA4OKi1MtxkVTPFracg26UctUTaonjACWvQGeRqFeGHC3BiS79oqPGDtKu/vDtVG4KPkdQYBRe+gI8GhYC3b9WC0jE0sqX85AYRXhfnhCRqsy78jFB6o6Qn040oIRrYUgtUJnmU0cvrR/m7FlFjb5bu1HfRCI+zQvgEAAP//1oRtDkH5PBkAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (8, 'OktopPlus', 200, 'gsrg121', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8BK645moVFy+ItyxrECzjXgF+htALHOgPxnn74ghgLiCDl0WnE6WJjg3osfKjBfTaMAM+2GLbMx0LoZ+F6fg1XepgwX23AP5SibFy/Cu8NsBNwvcTwvtdA60fdzlA9vkl9ckAEzR2h/ANR+d/6V/NSjcXSgQy5cU1C7OsZ8i8Ds+8mnnb7BfIDc5J6CQXZsda5rr7A1gZiGaXUx3FANj+PLzr6HTTmQHCesdhKO323x6HQYw8s3QYUqmj1IKlH9aNL9xY0APa2FFfB1G0E3cU6ai/ZmGsP4BdBwvSO/wwiaaj+jsNHBC4zswvCziRBqUHgR6coHMD8yrj1ZfSGkVissw+/0gHmu+ykAcxXZss2ptl39+bEb3NyNVzG/1z7ZGS6ReI/WfGAjnN9wofhxfJcv4s33TxUFFhcWhVX0H14RpdUcrT4W6+3dauCs0RN+aKAtbDuhfmKAMlZ7TKBX3mxTo5Z2OG5E8/YNMqBDJDy2l1N62xPNbFX7OkvElhwyP6IPvJAALCb6cC8+SJlaGc//oFSYUPdHvO1urCAbjJ9trSuUfRgNq1FLKRxH7nEenH/KWtX9k9+FuQAAf9wCwBwbuUx8cRKHWcosTvsYTAxA/54EsGRlDbxZQB4/sfnZOXD6ou5evtMN6FygMd297PD9LZ0L92mGpTnjN8ZSaAL8RS2KAXaY5+JQfoLuuolg2/8Aex4AzEax5JUnEEOh724PkEFTKsnl8XogmUB5t4607dcZbrzkXmyxbu54CgCq2w+iw8p5WyPvcf4B7uAQHQPPDYICcpkwePdAcsoQmK4yzI+w14MfrN/DtZymzjuWCw1e3G9copiJEHTAyRYwCOE/53u8AOdYB72ukaS7X6BwPNHysjsspdH7+ErPloJQoQ+HaCFt/0pGUNfYhpHS8Dj//IruYQCAir0kRK9rj7EE5X97np/AkmefW8+5ntYleYKdXgYkM7/5ZnX7kVx5AbAMgspra4g/sltm226wfs4zKlD0CJtIG5aMnBOyimXX9qG4gD4wZkf/snw8ivUg149QEAAP//SFyM2U32S30AAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (9, 'Cirena', 100, 'crt600', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8BACXvrO63G75ZlZxBo5KoXW6JacXU/5jRHz89PQPjvDnrfO5wjHqjXn/Tx/ZbfDrtwLNgyclJ/W+2wdEAjA26LvpIyHnkmKAYW8sOsEybiBqQegBO/d4lEb4nR2NZtXY2p0Cdg7Iae09ppjq0GQHmD8456cQsbeTPPFXMROMw5twA95yJvVcGyzakODh3OFz5+APA0Squ34lz6z8ol8j2bamKqzrpu56Dy0SDceXg1QnzMG2ZQ/QcuwaHzikKCtzGWx61ARY9RDOEituA6ke+uPFMdkRcTm2LBH5bI8BFZo5U1FTWOsWX9wv2N2qpw+fXxtKqnwAUPbkUerkMO+LwxghK0CQPx4BxfVENnYK1jHRn0DRaNLwWODrxMv5UzcReGVUFFZoAgcvzyNiLKATynwsXWgHhUbBL8/e2SoG52Ptdw3sUHqXv4EeFq2o5LTEK2ScAyzjCQDsWuxtKjI/UGODzYTFKOJN9LNmCZq2dtvxKFMIxtBshFZGtTQg/aUFmGcljAco9fgBU9Fu8kLXwJyUGyAROBEC0pV6Vf4dzHmkyqwWXli3FvgY/uHPRYGgey1sRlnnEjJKAnEKuSN8OysVQK8hskGyr7j7v3lDSfHnw+2XBj/E7PbsH6A/5fgB3DX5NbzOMJBi9wBrir/spAUV1SuxfwCxAglIUo0nDHwU1tlzWGDoILJwYOREnzXIJUBN64DOCfOesAICdSxiIE4NoN8NvNZLEUYo0vruPSpLUZlg2ANpoI2nk2MiFsoSleM96iPQwpsZ6DbNA50oXphT9l84Iu/O6BBJ/MY6YM8lS9+SfLwU0pXbGEC97452feDy33h8l5WOPjnpUwL4xguc9YGSWVroNSieZCppwxUSS0u2EbxoOXSbvOk8/CTHPTsDE+zwo98vbOiKo2ACzsUtC9JJUbUMLDQZyOSoxVRFw+CJCAKy8yLsBMErfngJtK/jzPaTHXhkKgUgFt8pAEoRYngYGRBzl2mvAix8EHFJB1KkqGq4LrXmKoe5RSgXFwqUTe0NnrYT/e/nw/QABgEAAP//s3x1Dt0/FukAAAAASUVORK5CYII=');

insert into medication (id, name, weight, code, image)
values (10, 'FarenPlus', 200, 'yy89ggg', 'iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAIAAACQkWg2AAADIElEQVR4nAAQA+/8BAoTtd/g/l3dJlL8jOt5bOLKNV3sYf3KAQTUJIEpn3UzNZrkfvIMJnT7vnA0DoTVjgLWWkgG0fVb8fqNl+BMcvwkm5StfCn7F3MXS88Z+TfMTFfUocogNA2H4a2v0wwUIZQDgO8nuhnvrgBoZBKqybAh9wrKf1IQICZcCfX2YE3fCB9v9HYsDQSMJDu+X4yHHQzxBIQU1wFV8+BMz6tCtOk1BCh4tokt9aGmCxNjfY9dOaP+28ZTY0mM2MAMHvyK2975WgInzS/N11M3Zj5+p4p/JrIW1KAD2fd6YBP3QrcD7iSQaS6x1FMhmg8kZMi36oQDxPkE1siQDJRD7d5jgTkq3zytVQ313RQXfroIEuz89ii1VlqYdJ9ny9GP0/MKW7p2Z5EVA5YILX2IcqgF9O2lN/a3/Gw6X1006H7c2vHzMIzigzZsJwl1b3o4yHqqmeYYiM4gJQEkXq99FQCc6jYj8veGN4pAxzk3Eeti9GwSCAJHl3aAOtqRP6jd8iDeMvQYQPMOR78D9taxPTz0bcuMAXMZkd5Q6gDqZKpr3Jn2gPhZE804hHsbBhF/R/T87ImbA1BTka71BJcjis7wRNUj7VvpIRGaIHqcCCnRQoPYVDc9eDx4rhsddzxjDvROj9qW6vPA6g1TBgKMcwqtJjgP17OelFRzbvV4373ZNVk4KiXp49EtshXXtX9xSeABVf16s2mypjgJNXAAGqBD8DPFutUZHsW3A9hD71Ro+96fmkV4eujHtNm7BNeRln5TdabV9gnQneNsHxtEAjvSNBp5a1tPU34ixpcMMfee4+7TVFKV71GxDWkD3Xd498xkCUMnLI6FmRMsnixHDAA0m6s0ozO4HtDNM48Q8SzlDgqWOiH72H0i96yukabhZBT0n0Kd8VIH2pKj0FaoGc4Cf5NdEVN7zR4FVJv7tv1PkQoqeyiKjGouMrwKCd69yKLQxOVF/iPZGkXW4BWksKgKBC485wRglnRIPCQE1RiyCPkON59Aa2pK9ZbwanNUKbDL6NxUAqm1W0khwD9Wz+/teAEAAP//lrJ5qmik1MEAAAAASUVORK5CYII=');

alter sequence seq_medication restart with (select coalesce(max(id), 0) + 1 from medication);