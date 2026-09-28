package Q1;

import java.util.concurrent.Callable;
import m2.C0880v;
import w1.C1387i;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5286b;

    public /* synthetic */ g(k kVar, int i2) {
        this.f5285a = i2;
        this.f5286b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        K1.h hVar;
        r1.r rVar;
        C1387i a3;
        switch (this.f5285a) {
            case 0:
                k kVar = this.f5286b;
                hVar = (K1.h) kVar.f5297f;
                rVar = (r1.r) kVar.f5292a;
                a3 = hVar.a();
                try {
                    rVar.c();
                    try {
                        a3.b();
                        rVar.o();
                        hVar.c(a3);
                        return C0880v.f8657a;
                    } finally {
                    }
                } finally {
                }
            default:
                k kVar2 = this.f5286b;
                hVar = (K1.h) kVar2.f5298g;
                rVar = (r1.r) kVar2.f5292a;
                a3 = hVar.a();
                try {
                    rVar.c();
                    try {
                        a3.b();
                        rVar.o();
                        hVar.c(a3);
                        return C0880v.f8657a;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
