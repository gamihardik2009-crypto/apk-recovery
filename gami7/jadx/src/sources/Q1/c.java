package Q1;

import java.util.concurrent.Callable;
import m2.C0880v;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R1.b f5272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f5273c;

    public /* synthetic */ c(e eVar, R1.b bVar, int i2) {
        this.f5271a = i2;
        this.f5273c = eVar;
        this.f5272b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r1.r rVar;
        switch (this.f5271a) {
            case 0:
                e eVar = this.f5273c;
                rVar = (r1.r) eVar.f5277a;
                rVar.c();
                try {
                    ((K1.b) eVar.f5278b).g(this.f5272b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            case 1:
                e eVar2 = this.f5273c;
                rVar = (r1.r) eVar2.f5277a;
                rVar.c();
                try {
                    ((K1.p) eVar2.f5279c).e(this.f5272b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            default:
                e eVar3 = this.f5273c;
                rVar = (r1.r) eVar3.f5277a;
                rVar.c();
                try {
                    ((K1.p) eVar3.f5280d).e(this.f5272b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
        }
    }
}
