package Q1;

import java.util.List;
import java.util.concurrent.Callable;
import m2.C0880v;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5284c;

    public /* synthetic */ f(k kVar, List list, int i2) {
        this.f5282a = i2;
        this.f5284c = kVar;
        this.f5283b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r1.r rVar;
        switch (this.f5282a) {
            case 0:
                k kVar = this.f5284c;
                rVar = (r1.r) kVar.f5292a;
                rVar.c();
                try {
                    ((j) kVar.f5296e).f(this.f5283b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            case 1:
                k kVar2 = this.f5284c;
                rVar = (r1.r) kVar2.f5292a;
                rVar.c();
                try {
                    ((i) kVar2.f5293b).h(this.f5283b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
            default:
                k kVar3 = this.f5284c;
                rVar = (r1.r) kVar3.f5292a;
                rVar.c();
                try {
                    ((K1.p) kVar3.f5295d).f(this.f5283b);
                    rVar.o();
                    rVar.j();
                    return C0880v.f8657a;
                } finally {
                }
        }
    }
}
