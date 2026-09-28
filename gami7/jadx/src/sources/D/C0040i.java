package D;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import c0.AbstractC0571K;
import c0.C0588g;
import c0.C0594m;
import c0.C0596o;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040i extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f859i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f860j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f861k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040i(long j3, y2.a aVar, boolean z3) {
        super(1);
        this.f859i = j3;
        this.f860j = aVar;
        this.f861k = z3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Z.c cVar = (Z.c) obj;
        C0588g q = K1.f.q(cVar, b0.f.d(cVar.f6379h.e()) / 2.0f);
        int i2 = Build.VERSION.SDK_INT;
        long j3 = this.f859i;
        return cVar.a(new C0039h(this.f860j, this.f861k, q, new C0594m(j3, 5, i2 >= 29 ? C0596o.f7267a.a(j3, 5) : new PorterDuffColorFilter(AbstractC0571K.A(j3), AbstractC0571K.D(5)))));
    }
}
