package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import r1.o;
import r1.p;
import z2.h;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: h, reason: collision with root package name */
    public int f6927h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f6928i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final p f6929j = new p(this);

    /* renamed from: k, reason: collision with root package name */
    public final o f6930k = new o(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.f(intent, "intent");
        return this.f6930k;
    }
}
