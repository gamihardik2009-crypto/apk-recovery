package t0;

import java.util.LinkedHashMap;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251i extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C1251i f10593j = new C1251i(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1251i f10594k = new C1251i(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1251i f10595l = new C1251i(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10596i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1251i(int i2, int i3) {
        super(i2);
        this.f10596i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f10596i) {
            case 0:
                return new C1236E(2, 0, true);
            case 1:
                return new LinkedHashMap();
            default:
                return new C1236E(3, 0, false);
        }
    }
}
