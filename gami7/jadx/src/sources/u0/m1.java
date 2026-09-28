package u0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import m2.C0880v;

/* loaded from: classes.dex */
public final class m1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L2.k f11114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(L2.g gVar, Handler handler) {
        super(handler);
        this.f11114a = gVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        this.f11114a.q(C0880v.f8657a);
    }
}
