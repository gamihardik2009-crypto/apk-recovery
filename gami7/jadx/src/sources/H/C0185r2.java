package H;

import M2.InterfaceC0343g;
import java.util.LinkedHashMap;

/* renamed from: H.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185r2 implements r.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3061b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C0179q2 f3062c;

    public C0185r2(r.l lVar, long j3) {
        this.f3060a = j3;
        this.f3062c = new C0179q2(lVar.f9797a, this, 0);
    }

    @Override // r.k
    public final InterfaceC0343g a() {
        return this.f3062c;
    }
}
