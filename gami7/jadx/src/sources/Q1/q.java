package Q1;

import java.util.concurrent.Callable;
import m2.C0880v;

/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R1.e f5319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f5320c;

    public /* synthetic */ q(r rVar, R1.e eVar, int i2) {
        this.f5318a = i2;
        this.f5320c = rVar;
        this.f5319b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r1.r rVar;
        switch (this.f5318a) {
            case 0:
                r rVar2 = this.f5320c;
                rVar = (r1.r) rVar2.f5322b;
                rVar.c();
                try {
                    ((K1.b) rVar2.f5323c).g(this.f5319b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            default:
                r rVar3 = this.f5320c;
                rVar = (r1.r) rVar3.f5322b;
                rVar.c();
                try {
                    ((K1.p) rVar3.f5324d).e(this.f5319b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
        }
    }
}
