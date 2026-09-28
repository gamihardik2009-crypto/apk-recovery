package i0;

import B.F;
import e0.InterfaceC0654d;
import m2.C0880v;

/* renamed from: i0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729v extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7935i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0730w f7936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0729v(C0730w c0730w, int i2) {
        super(1);
        this.f7935i = i2;
        this.f7936j = c0730w;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f7935i) {
            case 0:
                C0730w c0730w = this.f7936j;
                c0730w.f7939d = true;
                c0730w.f7941f.c();
                return C0880v.f8657a;
            default:
                InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
                C0730w c0730w2 = this.f7936j;
                C0709b c0709b = c0730w2.f7937b;
                float f3 = c0730w2.f7946k;
                float f4 = c0730w2.f7947l;
                K1.m e02 = interfaceC0654d.e0();
                long j3 = e02.j();
                e02.e().f();
                try {
                    ((F) e02.f4558a).F(f3, f4, 0L);
                    c0709b.a(interfaceC0654d);
                    e02.e().b();
                    e02.r(j3);
                    return C0880v.f8657a;
                } catch (Throwable th) {
                    e02.e().b();
                    e02.r(j3);
                    throw th;
                }
        }
    }
}
