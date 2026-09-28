package u;

import java.util.List;
import v.C1329A;
import v.InterfaceC1331C;

/* loaded from: classes.dex */
public final class l implements InterfaceC1331C {

    /* renamed from: a, reason: collision with root package name */
    public final i f10710a;

    /* renamed from: b, reason: collision with root package name */
    public final C1329A f10711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1329A f10713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f10714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10717h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10718i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f10719j;

    public l(i iVar, C1329A c1329a, int i2, x xVar, boolean z3, boolean z4, int i3, int i4, long j3) {
        this.f10713d = c1329a;
        this.f10714e = xVar;
        this.f10715f = z3;
        this.f10716g = z4;
        this.f10717h = i3;
        this.f10718i = i4;
        this.f10719j = j3;
        this.f10710a = iVar;
        this.f10711b = c1329a;
        this.f10712c = i2;
    }

    public final q a(int i2, int i3, int i4, int i5, long j3) {
        int i6;
        i iVar = this.f10710a;
        Object b3 = iVar.b(i2);
        Object n3 = iVar.f10694b.n(i2);
        List a3 = this.f10711b.a(j3, i2);
        if (O0.a.f(j3)) {
            i6 = O0.a.j(j3);
        } else {
            if (!O0.a.e(j3)) {
                throw new IllegalArgumentException("does not have fixed height".toString());
            }
            i6 = O0.a.i(j3);
        }
        int i7 = i6;
        O0.k layoutDirection = this.f10713d.f11272i.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.a aVar = this.f10714e.f10805k;
        return new q(i2, b3, this.f10715f, i7, i5, this.f10716g, layoutDirection, this.f10717h, this.f10718i, a3, this.f10719j, n3, aVar, j3, i3, i4);
    }
}
