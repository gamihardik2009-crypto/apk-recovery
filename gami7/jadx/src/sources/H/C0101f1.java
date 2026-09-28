package H;

import c0.AbstractC0574N;
import c0.AbstractC0598q;
import m2.C0880v;

/* renamed from: H.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101f1 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2574i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2575j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2576k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0101f1(int i2, long j3, Object obj) {
        super(0);
        this.f2574i = i2;
        this.f2576k = obj;
        this.f2575j = j3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f2574i) {
            case 0:
                ((y2.c) this.f2576k).l(Long.valueOf(this.f2575j));
                return C0880v.f8657a;
            case 1:
                return ((AbstractC0574N) ((AbstractC0598q) this.f2576k)).b(this.f2575j);
            default:
                t0.O R02 = ((t0.L) this.f2576k).a().R0();
                z2.h.c(R02);
                R02.a(this.f2575j);
                return C0880v.f8657a;
        }
    }
}
